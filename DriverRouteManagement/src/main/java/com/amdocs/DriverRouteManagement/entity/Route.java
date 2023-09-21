package com.amdocs.DriverRouteManagement.entity;



import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Route {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "route_id")
	int routeId;
	
	@Column(name = "route_length")
	int routeLength;
	
	@Column(name = "start_point")
	private String startPoint;
	
	@Column(name = "end_point")
	private String endPoint;

}
