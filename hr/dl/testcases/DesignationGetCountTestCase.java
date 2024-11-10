import com.thinking.machines.hr.dl.dao.*;
import com.thinking.machines.hr.dl.interfaces.dao.*;
import com.thinking.machines.hr.dl.exceptions.*;

public class DesignationGetCountTestCase
{
public static void main(String gg[])
{
try
{
DesignationDAOInterface designationDAO=new DesignationDAO();
int count=designationDAO.getCount();
System.out.println("Designation count : "+count);
}
catch(DAOException d)
{
System.out.println(d.getMessage());
}
}
}