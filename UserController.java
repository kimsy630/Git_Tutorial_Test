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
}