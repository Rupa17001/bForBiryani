// Model Class
package com.biryani.model;


	import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
	@Entity
	@Getter
	@Setter
	@NoArgsConstructor
	@AllArgsConstructor
	//table
	public class biryaniModel {
		@Id
		//columns
		private int biryaniId;
		private String biryaniName;
		private String biryaniDescrp;
		private String biryaniType;
		private int biryaniPrice;
	}

