package adapter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria {

	@Override
	public List<Employee> meetCriteria(List<Employee> persons) {
		// TODO Auto-generated method stub
		 List<Employee> malePersons = new ArrayList<Employee>();
		    for (Employee person : persons) {
		      if (person.getGender().equalsIgnoreCase("MALE")) {
		        malePersons.add(person);
		      }
		    }
		    return malePersons;
	}

}
