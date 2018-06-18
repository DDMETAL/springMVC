package service;
/**
 * 模型
 *  用来封装业务逻辑的处理
 * @author NiCo
 *
 */
public class BMIService {
		public String bmi(double height,double weight) {
			String status="正常";
			//计算bmi指数；
			double bmi=weight/height/height;
			//依据bmi指数判断用户身体状况
			if(bmi<19) {
				status="过轻";
			}
			if(bmi>25){
				status="过重";
			}
			return status;
		}
}
