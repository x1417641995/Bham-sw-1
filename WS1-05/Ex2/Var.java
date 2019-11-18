/**
 * The class can show the typeOfVar, nameOfVar
 * 
 * @author Ta-Ju
 * @version 2017-11-29
 */
public class Var{
	/**
	 *  @param String typeOfVar is the typeOfVar.
	 *  @param String nameOfVar is the nameOfVar
	 */
	private String typeOfVar;
	private String nameOfVar;
	public Var(String typeOfVar, String nameOfVar) {
		this.typeOfVar = typeOfVar;
		this.nameOfVar = nameOfVar;
	}
	/**
	 * @return typeOfVar
	 */
	public String getTypeOfVar(){
		return typeOfVar;
	}
	/**
	 * @return nameOfVar
	 */
	public String getNameOfVar(){
		return nameOfVar;
	}
	/**
	 * sets typeOfVar 
	 * @param typeOfVar
	 */
	public void setTypeOfVar(String typeOfVar){
		this.typeOfVar = typeOfVar ;
	}
	/**
	 * sets nameOfVar
	 * @param nameOfVar
	 */
	public void setNameOfVar(String nameOfVar){
		this.nameOfVar= nameOfVar ;
	}
}