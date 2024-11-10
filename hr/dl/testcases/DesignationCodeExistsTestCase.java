import com.thinking.machines.hr.dl.dao.*;
import com.thinking.machines.hr.dl.dto.*;
import com.thinking.machines.hr.dl.interfaces.dao.*;
import com.thinking.machines.hr.dl.interfaces.dto.*;
import com.thinking.machines.hr.dl.exceptions.*;

public class DesignationCodeExistsTestCase
{
public static void main(String gg[])
{
try
{
int code=Integer.parseInt(gg[0]);
DesignationDAOInterface designationDAO=new DesignationDAO();
System.out.println(designationDAO.codeExists(code));
}
catch(DAOException d)
{
System.out.println(d.getMessage());
}
}
}