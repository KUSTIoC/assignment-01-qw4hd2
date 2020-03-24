/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paper;

/**
 *
 * @author HP
 */
public class Faculty
{
	private String name;
	private String Id;

	public Faculty(String name, String id)
	{
		this.name=name;
                this.Id=id;
	}

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.Id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return Id;
    }

    @Override
    public String toString() {
        return "Faculty name :" + name + "\t\t\t\t\t\t\tid :" + Id ;
    }
        

}
