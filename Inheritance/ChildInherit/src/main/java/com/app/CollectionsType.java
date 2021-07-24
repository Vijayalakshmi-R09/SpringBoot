package com.app;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionsType 
{
	private List<String> mlist;
    private List<MobileCompany> mCompany;
    
	
	public CollectionsType(List<String> mlist,List<MobileCompany> mCompany) {
		super();
		this.mlist = mlist;
		this.mCompany = mCompany;
	}

	public CollectionsType() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<MobileCompany> getmCompany() {
		return mCompany;
	}

	public void setmCompany(List<MobileCompany> mCompany) {
		this.mCompany = mCompany;
	}

	public List<String> getMlist() {
		return mlist;
	}

	public void setMlist(List<String> mlist) {
		this.mlist = mlist;
	}


	@Override
	public String toString() {
		return "CollectionsType \n mlist= " + mlist + ",\n mCompany= " + mCompany ;
	}   
}
