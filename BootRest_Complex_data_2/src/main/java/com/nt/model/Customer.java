package com.nt.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

import lombok.Data;
@Data
public class Customer {
	private Integer cno;
	private String cname;
	private Double billamt;
	
	//has a property
	private Address addrs;
	
	private String[] nicknames;
	private List<String> friends;
	private Set<Long> phoneNumbers;
	private Map<String,Long> idDetails;
	
	

}
