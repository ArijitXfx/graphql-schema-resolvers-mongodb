package com.tricon.bean;

import org.springframework.data.annotation.Id;

import io.aexp.nodes.graphql.annotations.GraphQLArgument;
import io.aexp.nodes.graphql.annotations.GraphQLProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@GraphQLProperty(name = "getProductById", arguments = {
		@GraphQLArgument(name = "id", type = "String")
})
public class Product {
	@Id
	private String id;
	private String name;
	private int price;
}
