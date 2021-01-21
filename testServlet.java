package unit11;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class testServlet
 */

@WebServlet("/testServlet")

public class testServlet extends HttpServlet {

 private static final long serialVersionUID = 1L;

 /**
  * @see HttpServlet#HttpServlet()
  */

 public testServlet() {
  super();
  // TODO Auto-generated constructor stub
 }

 /**
  * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
  *      response)
  */

 protected void doGet(HttpServletRequest request, HttpServletResponse response)
   throws ServletException, IOException {
  // TODO Auto-generated method stub
  response.setContentType("text/html; charset=UTF-8");

  String userName = request.getParameter("userName");
  int userNoBir = Integer.parseInt(request.getParameter("userNoBir"));
  int userNoSec = Integer.parseInt(request.getParameter("userNoSec"));
  String userID = request.getParameter("userID");
  String userPwd = request.getParameter("userPwd");
  String userPwdchk = request.getParameter("userPwdchk");
  String userEmail = request.getParameter("userEmail");
  String Emailaddr = request.getParameter("Emailaddr");
  String EmailSelect = request.getParameter("EmailSelect");
  int userHomeNo = Integer.parseInt(request.getParameter("userHomeNo"));
  String userAddr1 = request.getParameter("userAddr1");
  String userAddr2 = request.getParameter("userAddr2");
  String userHP = request.getParameter("userHP");
  String Job = request.getParameter("job");
  String chkMailSMS = request.getParameter("chkMailSMS");

  PrintWriter out = response.getWriter();

  out.print("<html><body>");
  out.print("<h1> 회원 정보 <h1> <br><hr>");
  out.println("이름 : <b>" + userName);
  out.print("<br>");
  out.println("</b>주민등록번호 : <b>" + userNoBir + "-" + userNoSec);
  out.print("<br>");
  out.println("</b>아이디 : <b>" + userID);
  out.print("<br>");
  out.println("</b>비밀번호 : <b>" + userPwd);
  out.print("<br>");
  

  if (Emailaddr.trim() == "")
   out.println("</b>이메일 : <b>" + userEmail + "@" + EmailSelect);
  else
   out.println("</b>이메일 : <b>" + userEmail + "@" + Emailaddr);  
  out.print("<br>");

  out.println("</b>우편번호 : <b>" + userHomeNo);
  out.print("<br>");
  out.println("</b>주소 : <b>" + userAddr1);
  out.print(userAddr2);
  out.print("<br>");
  out.println("</b>핸드폰번호 : <b>" + userHP);
  out.print("<br>");
  out.println("</b>직업 : <b>" + Job);
  out.print("<br>");
  out.println("</b>메일/문자 수신 여부 : <b>" + chkMailSMS);
  out.print("<br>");

  String pls[] = request.getParameterValues("pl");
  if (pls == null) {
   out.print("</b>선택한 항목이 없습니다. <b>");
  } else {
   out.println("</b>관심분야 : <b>");
   for (String pl : pls)
    out.print(pl + " ");
  }

  out.print("</b><br>");
  out.println("</b><br><br><a href='javascript:history.go(-1)'>다시</a>");
  out.print("</body></html>");
  out.close();
 }

 /**
  *
  * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
  *      response)
  *
  */

 protected void doPost(HttpServletRequest request, HttpServletResponse response)
   throws ServletException, IOException {

  // TODO Auto-generated method stub

  doGet(request, response);

 }

}