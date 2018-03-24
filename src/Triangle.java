/**
 * 
 */
/**
 * @author lenovo
 *
 */
package cn.tju.scs;

public class Triangle {
    private int one;
    private int two;
    private int three;
    public static boolean isLegal(int len1, int len2, int len3){
        if(len1 <= 0 || len2 <= 0 || len3 <= 0)
            return false;
         
        if(len1 + len2 > len3 && len2 + len3 > len1 && len1 + len3 > len2)
            return true;
             
        return false;
    }
    public Triangle(int side_1, int side_2, int side_3){
        if(isLegal(side_1, side_2, side_3)){
            one = side_1;
            two = side_2;
            three = side_3;
        }
        else
            System.out.println("���Ϸ���");
    }  
    public boolean isEquilatera(){
    	if(one == two && one == three)
    		System.out.print("�ȱߣ� ");
    	else
    		System.out.print("�ǵȱߣ� ");
        return (one == two && one == three);
    }
    public boolean isIsosceles(){
    	if(one == two || one == three || two == three)
    		System.out.print("������ ");
    	else
    		System.out.print("�ǵ����� ");
        return (one == two || one == three || two == three);
    }
    public boolean isScalene(){
    	if(one != two && one != three && two != three)
    		System.out.print("�ǵȱߣ� ");
    	else
    		System.out.print("������һ�Ա���ȣ� ");
        return (one != two && one != three && two != three);
    }
    public static void main(String[] args){
        Triangle tri = new Triangle(3,3,3);
        System.out.println(tri.isEquilatera());
        System.out.println(tri.isIsosceles());
        System.out.println(tri.isScalene());
    }
}