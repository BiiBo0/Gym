/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gym_f;

import java.util.HashMap;
import java.util.Map;


public class DataOfCoach {
       private static int id=0;
       private static String name;
       private static String phone;
       private static int working_hour;
       private static int num_of_trainee;

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        DataOfCoach.name = name;
    }

    public static String getPhone() {
        return phone;
    }

    public static void setPhone(String phone) {
        DataOfCoach.phone = phone;
    }

    public static int getWorking_hour() {
        return working_hour;
    }

    public static void setWorking_hour(int working_hour) {
        DataOfCoach.working_hour = working_hour;
    }

    public static int getNum_of_trainee() {
        return num_of_trainee;
    }

    public static void setNum_of_trainee(int num_of_trainee) {
        DataOfCoach.num_of_trainee = num_of_trainee;
    }

    private static Map<String ,Integer> name_id = new HashMap<>();
    
    public static int add_coach(){
        id++;
        return id;
    }
    public static int Get_id(){
       return id;
    }

    public static void setId(int id) {
        DataOfCoach.id = id;
    }
    
    public static void  set_name_id(String name,int id){
        name_id.put(name,id);
    }
    
   public static int get_id_by_name(String name){
        return name_id.get(name);
   }
}
