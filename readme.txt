				ALOG COMPANY

1. context name - /springapp or root context
2

Object;

vehicle
	. id
	. nameplate
	. no.of wheels
	. no.of axle
	. mileage
	. type

route
	. id 
	. start
	. end
	. total dist
	
order
	. id
	. by
	. truck_id
	. ex_trip_st
	. ex_trip_end
	. actual_trip_st
	. act_trip_end
	. status (CREATED, PROGRESS, COMPLETED)
	. work_log

User:
	.id
	.fname
	.lname
	.email
	.phone
	.type

user_type:
	.id (this determines based on admin, agent and drivers)
	.desc

Authorization:
	sysadmin
	Manager
	Agent
	drivers

Functionality Covered: 
	0. Main Page 
		Truck in running
		list for all pages.

	1. Order entry by agent (would populate order, route) (/order/create/)
	2. Order List page (sorting based on status) (order/list/)
		2.1 Order details page  (order/detail/<order_nul>)
	3. Inventry list page  (/vehicle/list/)
		3.1 Inventry Details page (vehicle/detail/id/<ID> or /vehicle/detail/nameplate/<ID>)
	4. User List page - /user/list/
		4.1 User Details page - /user/detail/userid/
	5. Search page /search/<based_on>/search+term
	6. Add Inventry  /vehicle/add/ and /vehicle/add/submit/ 
	7. Add Users (except sysadmin) /user/add/ and /user/add/submit/