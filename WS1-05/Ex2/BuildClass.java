
/**
 * The class can show the typeOfVar, nameOfVar
 * 
 * @author Ta-Ju
 * @version 2017-11-29
 */
import java.util.ArrayList;
import java.util.Arrays;

public class BuildClass {
	/**
	 * @param String
	 *            className is the className.
	 * @param ArrayList<Var>
	 *            fields is the fields
	 */
	private String className;
	private ArrayList<Var> fields;

	public BuildClass(String className, ArrayList<Var> fields) {
		this.className = className;
		this.fields = fields;
	}

	/**
	 * @return Fields
	 */
	public String makeFields() {
		String str_fields = "";
		for (int i = 0; i < fields.size(); i++) {
			str_fields = str_fields + "private " + fields.get(i).getTypeOfVar() + " " + fields.get(i).getNameOfVar()
					+ ";\n";
		}

		return str_fields;
	}

	/**
	 * @return Constructor
	 */
	public String makeConstructor() {
		String str_fields2 = "( ";
		String str_fields3 = "";
		for (int i = 0; i < fields.size(); i++) {
			str_fields2 = str_fields2 + fields.get(i).getTypeOfVar() + " " + fields.get(i).getNameOfVar() + ",";
		}
		str_fields2 = str_fields2 + ") ";
		for (int i = 0; i < fields.size(); i++) {
			str_fields3 = str_fields3 + "this." + fields.get(i).getNameOfVar() + "=" + fields.get(i).getNameOfVar()
					+ ";\n";
		}
		return "public " + className + str_fields2 + "{ \n" + str_fields3 + "} \n";
	}

	/**
	 * @return Getters
	 */
	public String makeGetters() {
		String str_fields4 = "";
		for (int i = 0; i < fields.size(); i++) {
			str_fields4 = str_fields4 + "public " + fields.get(i).getTypeOfVar() + " get" + fields.get(i).getNameOfVar()
					+ "() {\n" + "return " + fields.get(i).getNameOfVar() + "\n";
		}
		str_fields4 = str_fields4 + "}\n";
		return str_fields4;
	}

	/**
	 * @return Setters
	 */
	public String makeSetters() {
		String str_fields4 = "";
		for (int i = 0; i < fields.size(); i++) {
			str_fields4 = str_fields4 + "public void " + "set" + fields.get(i).getNameOfVar() + "("
					+ fields.get(i).getTypeOfVar() + " " + fields.get(i).getNameOfVar() + ") {\n" + "this."
					+ fields.get(i).getNameOfVar() + "=" + fields.get(i).getNameOfVar() + "\n";
		}
		str_fields4 = str_fields4 + "}\n";
		return str_fields4;

	}

	/**
	 * @return Class
	 */
	public String buildClass() {
		String str_fields5 = "public class " + className + " {\n" + makeFields() + makeConstructor() + makeGetters()
				+ makeSetters() + "}";
		System.out.println(str_fields5);
		return str_fields5;
	}
	/**
	 * @test
	 */
	public static void main(String[] args) {
		//	BuildClass test=new BuildClass();
			
			Var f1=new Var("String","f1");
			Var f2=new Var("String","f2");
			
			ArrayList<Var> fields=new ArrayList<Var>(Arrays.asList(f1,f2));
			BuildClass AAA = new  BuildClass("AAA",fields);
			AAA.buildClass();
		
		}
}