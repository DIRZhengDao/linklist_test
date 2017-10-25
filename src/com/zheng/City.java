package com.zheng;

import java.util.Arrays;

public class City implements Comparable<City> {
	/**
	 *@author zhengzhou
	 *@descripiton
	 *@date 11:21 2017/10/25
	 */

	private int citySort;

	private String cityName;
	
	public City() {
		super();
	}

	public City(int citySort, String cityName) {
		super();
		this.citySort = citySort;
		this.cityName = cityName;
	}


	@Override
	public int compareTo(City city) {

		if(this.citySort>city.citySort) {
			return 1;
		}else if(this.citySort<city.citySort) {
			return -1;
		}else {
			return 0;
		}
	}

	public int getCitySort() {
		return citySort;
	}

	public void setCitySort(int citySort) {
		this.citySort = citySort;
	}


	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}


	@Override
	public String toString() {
		return "City [citySort=" + citySort + ", cityName=" + cityName + "]";
	}

}
