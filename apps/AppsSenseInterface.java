package org.morphone.sense.apps;

import java.util.List;

public interface AppsSenseInterface {
	
	List<String> getForegroundApps() throws AppsSenseException;
}
