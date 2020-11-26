
package org.javaturk.oopj.ch13.string;

public class PasswordBuilder {   
    public static void main(String[] args){
        if(args.length != 3){
            System.out.println("Error! Please provide three arguments as first name, last name, and age!");
            System.exit(0);
        }
        else{
        	PasswordBuilder pb = new PasswordBuilder();
            String password = pb.makePassword(args);
            System.out.println("Password is " + password );
        }
    }
    
    public String makePassword(String[] args){
        StringBuffer sb = new StringBuffer();
        
        char firstOfName = args[0].charAt(0);   sb.append(Character.toLowerCase(firstOfName));       
        char firstOfAge = args[2].charAt(0);    sb.append(firstOfAge);       
        int random = (int) (9 * Math.random()); sb.append(random);   
        char firstOfLName = args[1].charAt(0);  sb.append(Character.toLowerCase(firstOfLName));
        char secondOfAge = args[2].charAt(1);   sb.append(secondOfAge);
        random = (int) (9 * Math.random());     sb.append(random);
        
        String password = sb.toString();
        return password;
    }
}
