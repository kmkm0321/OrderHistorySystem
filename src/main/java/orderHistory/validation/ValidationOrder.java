package orderHistory.validation;

import javax.validation.GroupSequence;
import javax.validation.groups.Default;

@GroupSequence({Default.class, 
	ValidationGroup1.class, 
	ValidationGroup2.class,
	ValidationGroup3.class})
public interface ValidationOrder {

}
