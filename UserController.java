@Controller
public class UserController{
	//로그인 페이지로 이동
	@RequestMapping("/user/login.do")
	public String login(){
		logger.Info("경로 : login");
		retunr "user/login";
	}
	//회원가입 페이지로 이동
	@RequestMapping("/user/insert.do")
	public String insert(){
		logger.Info("경로 : insert");
		retunr "user/insert";
	}
	//회원수정 페이지로 이동
	@RequestMapping("/user/update.do")
	public String update(){
		logger.Info("경로 : update");
		retunr "user/update";
	}

	//충돌해결
	//회원삭제 페이지로 이동
	@RequestMapping("/user/delete.do")
	public String delete(){
		logger.Info("경로 : delete");
		retunr "user/delete";
	}
}