import java.lang.reflect.Field;

public class Main {

	public static void main(String[] args) {

//		 Class<String> classe = String.class;
//		 System.out.println("===Metodos===");
//		 for (Method m : classe.getDeclaredMethods()) {
//			 System.out.println(m.getName());
//		 }
//		 System.out.println("===Campos===");
//		 for (Field f : classe.getDeclaredFields()) {
//		 System.out.println(f.getName());
//		 }

		 String teste = "Hello WORLD";
		 System.out.println(teste);
		 alteraString(teste);
		 System.out.println(teste);
	}

	public static void alteraString(String s) {
		try {
			Field valor = String.class.getDeclaredField("value");
			valor.setAccessible(true);
			char[] arrayChar = (char[]) valor.get(s);
			arrayChar[0] = '#';
			arrayChar[1] = '#';
			arrayChar[2] = '#';

		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
