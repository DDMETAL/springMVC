package service;
/**
 * ģ��
 *  ������װҵ���߼��Ĵ���
 * @author NiCo
 *
 */
public class BMIService {
		public String bmi(double height,double weight) {
			String status="����";
			//����bmiָ����
			double bmi=weight/height/height;
			//����bmiָ���ж��û�����״��
			if(bmi<19) {
				status="����";
			}
			if(bmi>25){
				status="����";
			}
			return status;
		}
}
