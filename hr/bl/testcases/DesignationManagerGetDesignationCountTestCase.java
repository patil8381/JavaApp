import com.thinking.machines.hr.bl.managers.*;
import com.thinking.machines.hr.bl.pojo.*;
import com.thinking.machines.hr.bl.interfaces.managers.*;
import com.thinking.machines.hr.bl.interfaces.pojo.*;
import com.thinking.machines.hr.bl.exceptions.*;
import java.util.*;

public class DesignationManagerGetDesignationCountTestCase
{
public static void main(String gg[])
{
int count;
try
{
DesignationManagerInterface designationManager=DesignationManager.getDesignationManager();
count=designationManager.getDesignationCount();
System.out.println("Designtion count : "+count);
}catch(BLException blException)
{
if(blException.hasGenericException())
{
System.out.println(blException.getGenericException());
}
List<String> properties=blException.getProperties();
for(String property:properties)
{
System.out.println(blException.getException(property));
}
}
}
}