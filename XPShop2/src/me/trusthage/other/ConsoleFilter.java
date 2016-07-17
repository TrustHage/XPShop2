package me.trusthage.other;

import java.util.logging.Filter;
import java.util.logging.LogRecord;

public class ConsoleFilter implements Filter{
	
	@Override
	public boolean isLoggable(LogRecord record){
		
		if(record.getMessage().equals("Saving...")){
			return false;
		}else{
			return true;
		}
	}

}
