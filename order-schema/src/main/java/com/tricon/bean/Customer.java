package com.tricon.bean;


import io.aexp.nodes.graphql.annotations.GraphQLArgument;
import io.aexp.nodes.graphql.annotations.GraphQLProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@GraphQLProperty(name = "getCustomerById", arguments = {
		@GraphQLArgument(name = "id", type = "String")
})
public class Customer {
	private String id;
	private String email;
	private String password;
}
