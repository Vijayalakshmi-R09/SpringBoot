package com.app;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionsType 
{
	private List<String> mlist;
    private Set<String> mset;
    private Map<Integer, String> mmap;
    private Properties mprops;
    private List<MobileCompany> mCompany;
    
	
	public CollectionsType(List<String> mlist, Set<String> mset, Map<Integer, String> mmap, Properties mprops,
			List<MobileCompany> mCompany) {
		super();
		this.mlist = mlist;
		this.mset = mset;
		this.mmap = mmap;
		this.mprops = mprops;
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

	public Set<String> getMset() {
		return mset;
	}

	public void setMset(Set<String> mset) {
		this.mset = mset;
	}

	public Map<Integer, String> getMmap() {
		return mmap;
	}

	public void setMmap(Map<Integer, String> mmap) {
		this.mmap = mmap;
	}

	public Properties getMprops() {
		return mprops;
	}

	public void setMprops(Properties mprops) {
		this.mprops = mprops;
	}

	@Override
	public String toString() {
		return "CollectionsType \n mlist= " + mlist + ",\n mset= " + mset + ",\n mmap= " + mmap + ",\n mprops= " + mprops
				+ ",\n mCompany= " + mCompany ;
	}   
}
