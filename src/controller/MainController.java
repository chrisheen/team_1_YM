package controller;

import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import command.MainCommand;


public class MainController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//�Խñ� �������� ��ȸ��� �Ǽ� ��� ����
	static final int LISTCOUNT = 10;
	
	//Ŭ�������� Key�� command�̰� ��ü�� CommandŸ������ �����ϱ����� map���� 
	private Map<String,MainCommand> CarSharingCommandMap = new HashMap<>();

	//tomcat �⵿�� command��ü���� ���� commandMap�� ����
	@Override
	public void init() throws ServletException {
	 //web.xml�� init-param�� �о� ó��
		String configFile = getInitParameter("CarSharingConfigFile");
		System.out.println("CarSharingConfigFile:"+configFile);
		//<���ڿ�,���ڿ�> �� �б� <- properties
		Properties prop = new Properties();
		//File system���� �������� ���
		String configFilePath = getServletContext().getRealPath(configFile);
		System.out.println("CarSharingConfigFile:"+configFilePath);
		//File system�� properties���ϰ� ���ڴ����� �Է� ��Ʈ�� ��� ����(��ü ����)
	    try(FileReader fis =new FileReader(configFilePath)) {
	    	   //properties��ü�� �����ϱ�
	    	prop.load(fis);

	      //propteries���̷κ��� �о���� ������ �����Ͽ� ��ü ����
	      Iterator keyItor = prop.keySet().iterator();
	      while(keyItor.hasNext()) {
	    	  String command =(String)keyItor.next();
	    	  String className = prop.getProperty(command);
	    	  Class<?> action = Class.forName(className);
	    	  //properties�� value�� �ش��ϴ� ���ڿ��� ��ü ����
	    	  MainCommand actionCommand=(MainCommand) action.newInstance();// new mvc.command.BoardUpdateAction();
	    	  CarSharingCommandMap.put(command, actionCommand);  
	      }
	      
	      //���
	      Iterator itor =CarSharingCommandMap.keySet().iterator();
	      while(itor.hasNext()) {
	    	  String command = (String)itor.next();
	    	 System.out.println(command+"="
	    	        +((MainCommand)CarSharingCommandMap.get(command)).getClass().getName());
	      }
	    }catch(Exception e) {
	    	System.out.println("����:"+e.getMessage());
	    }
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		doGet(request, response);
	}

	/* ~~.do�� ��û�ϴ� ��� request�� BoardController�� ���ϸ��� ó��  */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
	   //���ڼ� ����
	   request.setCharacterEncoding("utf-8");
       
       //�������� �����Ǵ� ��ü�� ����Ÿ�� ����
       response.setContentType("text/html;charset=utf-8");
       response.setCharacterEncoding("utf-8");
       
       action(request,response);
       
}//doGet()�޼ҵ� ��.
	
 //request��û�� ó���ϴ� �޼ҵ�	
 private void action(HttpServletRequest request, 
		             HttpServletResponse response) throws ServletException,IOException{
	 String requestURL = request.getRequestURL().toString();	
     String requestURI = request.getRequestURI();
     String contextPath = request.getContextPath();
     String command = requestURI.substring(contextPath.length());
     String queryString 
       = request.getQueryString()==null?"":request.getQueryString();//get����϶� ������Ʈ�� ���
     
     System.out.println("requestURL:"+requestURL);
     System.out.println("requestURI:"+requestURI);
     System.out.println("contextPath:"+contextPath);
     System.out.println("command:"+command);
     System.out.println("queryString:"+queryString);
     
     //��û uri command�� �ش��ϴ� Ŭ���� ���
     MainCommand commandAction = CarSharingCommandMap.get(command);
     //�̵��� view������ ����
     String viewPage=null;
     try {
    	//command�� �ش��ϴ� ��ü�� action�޼ҵ� ����(�� ��û�� ���� �� �б� ó��) �� 
    	// �̵������� ���
       viewPage=commandAction.action(request, response);//�������� �̿��� �޼ҵ� ����
     }catch(Throwable e) {
    	 throw new ServletException(e);
     }
     if(viewPage!=null) {
    	 //forwardó��
    	 RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
    	 dispatcher.forward(request, response);
     }
 }


}