package one;

public class CustomExpDemo {

	private static String mobile;
	
	public static void judgeMobile(){
		if(mobile.length() < 11 && mobile != "") {
			//�׳�ҵ���쳣
			throw new CustomExeption("�ֻ�λ������");
		}
		
		else if(!mobile.matches("[0-9]+")&& mobile != "")
		{
			    throw new CustomExeption("�ֻ��ű���Ϊ����");
		}else if(mobile.equals("")){
				throw new CustomExeption("�ֻ��Ų���Ϊ��");
				}
	}
	
	public static void main(String[] args) {

		mobile = "";
		
		try{
			judgeMobile();
		}catch(CustomExeption ce){
			System.out.println(ce.getMessage());
		}
		
	}

}