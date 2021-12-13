package com.xworkz.lamdaexpn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class PresidentDAO {
	Collection col=new ArrayList();
	public boolean save(PresidentDTO dto) {
		return col.add(dto);
		
	}
	public boolean find(President dt,String str) {
		Iterator<PresidentDTO>itr=col.iterator();
		while(itr.hasNext()) {
			PresidentDTO tmp=itr.next();
			if(dt.search(tmp,str)) {
				return true;
			}
		}
		return false;
}
	public void add(PresidentDTO presidentDTO) {
		// TODO Auto-generated method stub
		
	}

}

