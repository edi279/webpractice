/**
 *
 * 입력된 값에 대하여 유효성을 검사하는 자바스크립트입니다.
 *
 */

function check() {

 if (document.frm.userName.value == "") {
  alert("이름을 입력해주세요.");
  document.frm.userName.focus();
  return false;
 } else if (document.frm.userNoBir.value == "") {
  alert("주민번호 앞자리를 입력해주세요.");
  document.frm.userNoBir.focus();
  return false;
 } else if (isNaN(document.frm.userNoBir.value)) {
  alert("숫자로 입력해주세요.");
  document.frm.userNoBir.focus();
  return false;
 } else if (document.frm.userNoBir.length == 6) {
  alert("주민번호 앞자리는 6자리여야 합니다. 다시 입력해주세요.");
  document.frm.userNoBir.focus();
  return false;
 } else if (document.frm.userNoSec.value == "") {
  alert("주민번호 뒷자리를 입력해주세요.");
  document.frm.userNoSec.focus();
  return false;
 } else if (document.frm.userNoSec.length == 7) {
  alert("주민번호 앞자리는 7자리여야 합니다. 다시 입력해주세요.");
  document.frm.userNoSec.focus();
  return false;
 } else if (isNaN(document.frm.userNoSec.value)) {
  alert("숫자로 입력해주세요.");
  document.frm.userNoSec.focus();
  return false;
 } else if (document.frm.userID.value == "") {
  alert("아이디를 입력해주세요.");
  document.frm.userID.focus();
  return false;
 } else if (document.frm.userID.length < 4) {
  alert("아이디는 최소 4자리 이상이어야 합니다.");
  document.frm.userID.focus();
  return false;
 } else if (document.frm.userPwd.value == "") {
  alert("비밀번호를 입력해주세요.")
  document.frm.userPwd.focus();
  return false;
 } else if (document.frm.userPwdchk.value == "") {
  alert("비밀번호 확인란에 비밀번호를 재입력해주세요.");
  document.frm.userPwdchk.focus();
  return false;
 } else if (document.frm.userPwd.length < 6) {
  alert("비밀번호는 최소 6자리 이상이어야 합니다.");
  document.frm.userPwd.focus();
  return false;
 } else if (document.frm.userPwd.value != document.frm.userPwdchk.value) {
  alert("비밀번호가 일치하지 않습니다. 다시 확인해주세요.");
  document.frm.userPwd.focus();
  return false;
 } else if (document.frm.userEmail.value == "") {
  alert("이메일 계정을 입력해주세요.");
  document.frm.userEmail.focus();
  return false;
 } else
  return true;

}