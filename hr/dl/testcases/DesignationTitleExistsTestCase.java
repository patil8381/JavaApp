import com.thinking.machines.hr.dl.dao.*;
import com.thinking.machines.hr.dl.dto.*;
import com.thinking.machines.hr.dl.interfaces.dao.*;
import com.thinking.machines.hr.dl.interfaces.dto.*;
import com.thinking.machines.hr.dl.exceptions.*;

public class DesignationTitleExistsTestCase
{
public static void main(String gg[])
{
try
{
String title=gg[0];
DesignationDAOInterface designationDAO=new DesignationDAO();
System.out.println(designationDAO.titleExists(title));
}
catch(DAOException d)
{
System.out.println(d.getMessage());
}
}
}