package net.saad.aichatbot.tools;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AITools {
    @Tool(name="getEmployee",description = "get information about a given employee  ")
    public Employee getEmployee(@ToolParam(description = "the  employee name ") String name ){
        return new Employee(name,12300,4);
    }
    @Tool(name = "")
    public List<Employee> getEmployees(){
        return List.of(new Employee("saad",30000,1),
                new Employee("jett",38298,8),
                new Employee("pheonix",9786,4));
    }
}
record Employee (String name , double salary, int seniority ){}