package com.gettrained.springboot.MyFirstProject;

public class Restaurant {
					int id;
					String name;
					String rating;
					
					public Restaurant(int id, String name, String rating) {
						super();
						this.id = id;
						this.name = name;
						this.rating = rating;
					}

					public int getId() {
						return id;
					}

					public void setId(int id) {
						this.id = id;
					}

					public String getName() {
						return name;
					}

					public void setName(String name) {
						this.name = name;
					}

					public String getRating() {
						return rating;
					}

					public void setRating(String rating) {
						this.rating = rating;
					}
					
}
