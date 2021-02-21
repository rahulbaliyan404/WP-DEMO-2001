<!DOCTYPE html>
<%@ taglib prefix="fmt" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta http-equiv="Content-Language" content="en">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title></title>
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no, shrink-to-fit=no" />
<meta name="description"
	content="This is an example dashboard created using build-in elements and components.">
<meta name="msapplication-tap-highlight" content="no">

<link href="${pageContext.request.contextPath}/resources/css/main.css"
	rel="stylesheet" type="text/css" />

<%-- <link
	href="${pageContext.request.contextPath}/resources/css/bootstrap/bootstrap.min.css"
	rel="stylesheet" type="text/css" />

<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/jquery.min.js"></script>

<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/bootstrap/bootstrap.min.js"></script> --%>


</head>
<body>
	<div
		class="app-container app-theme-white body-tabs-shadow fixed-sidebar fixed-header">
		<div class="app-header header-shadow">
			<div class="app-header__logo">
				<div class="logo-src"></div>
				<div class="header__pane ml-auto">
					<div>
						<button type="button"
							class="hamburger close-sidebar-btn hamburger--elastic"
							data-class="closed-sidebar">
							<span class="hamburger-box"> <span class="hamburger-inner"></span>
							</span>
						</button>
					</div>
				</div>
			</div>
			<div class="app-header__mobile-menu">
				<div>
					<button type="button"
						class="hamburger hamburger--elastic mobile-toggle-nav">
						<span class="hamburger-box"> <span class="hamburger-inner"></span>
						</span>
					</button>
				</div>
			</div>
			<div class="app-header__menu">
				<span>
					<button type="button"
						class="btn-icon btn-icon-only btn btn-primary btn-sm mobile-toggle-header-nav">
						<span class="btn-icon-wrapper"> <i
							class="fa fa-ellipsis-v fa-w-6"></i>
						</span>
					</button>
				</span>
			</div>
			<div class="app-header__content">
				<div class="app-header-left">
					<div class="search-wrapper">
						<div class="input-holder">
							<input type="text" class="search-input"
								placeholder="Type to search">
							<button class="search-icon">
								<span></span>
							</button>
						</div>
						<button class="close"></button>
					</div>
					<ul class="header-menu nav">
						<!--       <li class="nav-item">
                            <a href="javascript:void(0);" class="nav-link">
                                <i class="nav-link-icon fa fa-database"> </i>
                                Statistics
                            </a>
                        </li> -->
						<!--      <li class="btn-group nav-item">
                            <a href="javascript:void(0);" class="nav-link">
                                <i class="nav-link-icon fa fa-edit"></i>
                                Projects
                            </a>
                        </li> -->
						<!--      <li class="dropdown nav-item">
                            <a href="javascript:void(0);" class="nav-link">
                                <i class="nav-link-icon fa fa-cog"></i>
                                Settings
                            </a>
                        </li> -->
					</ul>

				</div>
				<div class="app-header-right">
					<div class="header-btn-lg pr-0">
						<div class="widget-content p-0">
							<div class="widget-content-wrapper">
								<div class="widget-content-left">
									<div class="btn-group">
										<a data-toggle="dropdown" aria-haspopup="true"
											aria-expanded="false" class="p-0 btn"> 
											<%-- <img width="42" class="rounded-circle"
											src="${pageContext.request.contextPath}/resources/images/avatars/10.jpg" alt="user profile">  --%>
											<img width="42" class="rounded-circle"
											src="${pageContext.request.contextPath}/showUserProfileImage/profileImage/${userProfileData.profilePhoto}" alt="user profile"> 
											<i class="fa fa-angle-down ml-2 opacity-8"></i>
										</a>
										<div tabindex="-1" role="menu" aria-hidden="true"
											class="dropdown-menu dropdown-menu-right">
											<button type="button" tabindex="0" class="dropdown-item">User
												Account</button>
											<button type="button" tabindex="0" class="dropdown-item">Settings</button>
											<h6 tabindex="-1" class="dropdown-header">Header</h6>
											<button type="button" tabindex="0" class="dropdown-item">Actions</button>
											<div tabindex="-1" class="dropdown-divider"></div>
											<button type="button" tabindex="0" class="dropdown-item">Dividers</button>
										</div>
									</div>
								</div>
								<div class="widget-content-left  ml-3 header-user-info">
									<div class="widget-heading">Alina Mclourd</div>
									<div class="widget-subheading">VP People Manager</div>
								</div>
								<div class="widget-content-right header-user-info ml-3">
									<button type="button"
										class="btn-shadow p-1 btn btn-primary btn-sm show-toastr-example">
										<i class="fa text-white fa-calendar pr-1 pl-1"></i>
									</button>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>



		<div class="app-main">
			<div class="app-sidebar sidebar-shadow">
				<div class="app-header__logo">
					<div class="logo-src"></div>
					<div class="header__pane ml-auto">
						<div>
							<button type="button"
								class="hamburger close-sidebar-btn hamburger--elastic"
								data-class="closed-sidebar">
								<span class="hamburger-box"> <span
									class="hamburger-inner"></span>
								</span>
							</button>
						</div>
					</div>
				</div>
				<div class="app-header__mobile-menu">
					<div>
						<button type="button"
							class="hamburger hamburger--elastic mobile-toggle-nav">
							<span class="hamburger-box"> <span class="hamburger-inner"></span>
							</span>
						</button>
					</div>
				</div>
				<div class="app-header__menu">
					<span>
						<button type="button"
							class="btn-icon btn-icon-only btn btn-primary btn-sm mobile-toggle-header-nav">
							<span class="btn-icon-wrapper"> <i
								class="fa fa-ellipsis-v fa-w-6"></i>
							</span>
						</button>
					</span>
				</div>
				<div class="scrollbar-sidebar">
					<div class="app-sidebar__inner">
						<ul class="vertical-nav-menu">
							<li class="app-sidebar__heading">Dashboards</li>
							<li><a href="/" class="mm-active"> <!-- <i	class="metismenu-icon pe-7s-rocket"></i>  -->

									Home Page
							</a></li>
							<li class="app-sidebar__heading">UI Components</li>
							<li><a href="#"> <!-- <i class="metismenu-icon pe-7s-diamond"></i> -->
									Elements <!-- <i
									class="metismenu-state-icon pe-7s-angle-down caret-left"></i> -->
							</a> <!-- 	<ul>
									<li><a href="elements-buttons-standard.html"> <i
											class="metismenu-icon"></i> Buttons
									</a></li>
									<li><a href="elements-dropdowns.html"> <i
											class="metismenu-icon"> </i>Dropdowns
									</a></li>
									<li><a href="elements-icons.html"> <i
											class="metismenu-icon"> </i>Icons
									</a></li>
									<li><a href="elements-badges-labels.html"> <i
											class="metismenu-icon"> </i>Badges
									</a></li>
									<li><a href="elements-cards.html"> <i
											class="metismenu-icon"> </i>Cards
									</a></li>
									<li><a href="elements-list-group.html"> <i
											class="metismenu-icon"> </i>List Groups
									</a></li>
									<li><a href="elements-navigation.html"> <i
											class="metismenu-icon"> </i>Navigation Menus
									</a></li>
									<li><a href="elements-utilities.html"> <i
											class="metismenu-icon"> </i>Utilities
									</a></li>
								</ul> --></li>
							<li><a href="#"> <!-- <i class="metismenu-icon pe-7s-car"></i> -->
									Components <!-- <i
									class="metismenu-state-icon pe-7s-angle-down caret-left"></i> -->
							</a> <!-- 	<ul>
									<li><a href="components-tabs.html"> <i
											class="metismenu-icon"> </i>Tabs
									</a></li>
									<li><a href="components-accordions.html"> <i
											class="metismenu-icon"> </i>Accordions
									</a></li>
									<li><a href="components-notifications.html"> <i
											class="metismenu-icon"> </i>Notifications
									</a></li>
									<li><a href="components-modals.html"> <i
											class="metismenu-icon"> </i>Modals
									</a></li>
									<li><a href="components-progress-bar.html"> <i
											class="metismenu-icon"> </i>Progress Bar
									</a></li>
									<li><a href="components-tooltips-popovers.html"> <i
											class="metismenu-icon"> </i>Tooltips &amp; Popovers
									</a></li>
									<li><a href="components-carousel.html"> <i
											class="metismenu-icon"> </i>Carousel
									</a></li>
									<li><a href="components-calendar.html"> <i
											class="metismenu-icon"> </i>Calendar
									</a></li>
									<li><a href="components-pagination.html"> <i
											class="metismenu-icon"> </i>Pagination
									</a></li>
									<li><a href="components-scrollable-elements.html"> <i
											class="metismenu-icon"> </i>Scrollable
									</a></li>
									<li><a href="components-maps.html"> <i
											class="metismenu-icon"> </i>Maps
									</a></li>
								</ul> --></li>
							<!-- 	<li><a href="tables-regular.html"> <i
									class="metismenu-icon pe-7s-display2"></i> Tables
							</a></li> -->

							<!-- <li class="app-sidebar__heading">Widgets</li>
							<li><a href="dashboard-boxes.html"> <i
									class="metismenu-icon pe-7s-display2"></i> Dashboard Boxes
							</a></li> -->

							<li class="app-sidebar__heading">Forms</li>

							<!-- <li><a href="forms-controls.html"> <i
									class="metismenu-icon pe-7s-mouse"> </i>Forms Controls
							</a></li> -->

							<!-- <li><a href="/formsLayoutData.html"> <i
									class="metismenu-icon pe-7s-eyedropper"> </i>Forms Layouts
							</a></li> -->

							<li><a href="#"> <!-- <i class="metismenu-icon pe-7s-eyedropper"> </i> -->
									Forms Layouts
							</a></li>

							<!-- <li><a href="/formValidationData.html"> <i
									class="metismenu-icon pe-7s-pendrive"> </i>Forms Validation
							</a></li>  -->

							<li><a href="#"> <!-- <i class="metismenu-icon pe-7s-pendrive"> </i> -->
									Forms Validation
							</a></li>

							<li class="app-sidebar__heading">Charts</li>
							<li><a href="/loadPieChartData"> <!--  <i class="metismenu-icon pe-7s-graph2"> </i> -->
									ChartJS
							</a></li>
						</ul>
					</div>
				</div>
			</div>



			<div class="app-main__outer">
				<div class="app-main__inner">


					<div class="row">
						<div class="col-md-6 col-xl-4">
							<div class="card mb-3 widget-content bg-midnight-bloom">
								<div class="widget-content-wrapper text-white">
									<div class="widget-content-left">
										<div class="widget-heading">Total Orders</div>
										<div class="widget-subheading">Last year expenses</div>
									</div>
									<div class="widget-content-right">
										<div class="widget-numbers text-white">
											<span>1896</span>
										</div>
									</div>
								</div>
							</div>
						</div>

						<div class="col-md-6 col-xl-4">
							<div class="card mb-3 widget-content">
								<div class="widget-content-outer">
									<div class="widget-content-wrapper">
										<div class="widget-content-left">
											<div class="widget-heading">Total Orders</div>
											<div class="widget-subheading">Last year expenses</div>
										</div>
										<div class="widget-content-right">
											<div class="widget-numbers text-success">1896</div>
										</div>
									</div>
								</div>
							</div>
						</div>

						<div class="col-md-6 col-xl-4">
							<div class="card mb-3 widget-content">
								<div class="widget-content-outer">
									<div class="widget-content-wrapper">
										<div class="widget-content-left">
											<div class="widget-heading">Products Sold</div>
											<div class="widget-subheading">Revenue streams</div>
										</div>
										<div class="widget-content-right">
											<div class="widget-numbers text-warning">$3M</div>
										</div>
									</div>
								</div>
							</div>
						</div>

					</div>





					<div class="row">

						<div class="d-xl-none d-lg-block col-md-6 col-xl-4">
							<div class="card mb-3 widget-content">
								<div class="widget-content-outer">
									<div class="widget-content-wrapper">
										<div class="widget-content-left">
											<div class="widget-heading">Income</div>
											<div class="widget-subheading">Expected totals</div>
										</div>
										<div class="widget-content-right">
											<div class="widget-numbers text-focus">$147</div>
										</div>
									</div>
									<div class="widget-progress-wrapper">
										<div
											class="progress-bar-sm progress-bar-animated-alt progress">
											<div class="progress-bar bg-info" role="progressbar"
												aria-valuenow="54" aria-valuemin="0" aria-valuemax="100"
												style="width: 54%;"></div>
										</div>
										<div class="progress-sub-label">
											<div class="sub-label-left">Expenses</div>
											<div class="sub-label-right">100%</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<div class="main-card mb-3 card">
								<div class="card-header">
									Active Users
									<div class="btn-actions-pane-right">
										<div role="group" class="btn-group-sm btn-group">
											<button class="active btn btn-focus">Last Week</button>
											<button class="btn btn-focus">All Month</button>
										</div>
									</div>
								</div>
								<div class="table-responsive">
									<table
										class="align-middle mb-0 table table-borderless table-striped table-hover">
										<thead>
											<tr>
												<th class="text-center">#</th>
												<th>Name</th>
												<th class="text-center">City</th>
												<th class="text-center">Status</th>
												<th class="text-center">Actions</th>
											</tr>
										</thead>
										<tbody>
											<tr>
												<td class="text-center text-muted">#345</td>
												<td>
													<div class="widget-content p-0">
														<div class="widget-content-wrapper">
															<div class="widget-content-left mr-3">
																<div class="widget-content-left">
																	<img width="40" class="rounded-circle"
																		src="${pageContext.request.contextPath}/resources/images/avatars/4.jpg"
																		alt="">
																</div>
															</div>
															<div class="widget-content-left flex2">
																<div class="widget-heading">John Doe</div>
																<div class="widget-subheading opacity-7">Web
																	Developer</div>
															</div>
														</div>
													</div>
												</td>
												<td class="text-center">Madrid</td>
												<td class="text-center">
													<div class="badge badge-warning">Pending</div>
												</td>
												<td class="text-center">
													<button type="button" id="PopoverCustomT-1"
														class="btn btn-primary btn-sm">Details</button>
												</td>
											</tr>
											<tr>
												<td class="text-center text-muted">#347</td>
												<td>
													<div class="widget-content p-0">
														<div class="widget-content-wrapper">
															<div class="widget-content-left mr-3">
																<div class="widget-content-left">
																	<img width="40" class="rounded-circle"
																		src="${pageContext.request.contextPath}/resources/images/avatars/3.jpg"
																		alt="">
																</div>
															</div>
															<div class="widget-content-left flex2">
																<div class="widget-heading">Ruben Tillman</div>
																<div class="widget-subheading opacity-7">Etiam sit
																	amet orci eget</div>
															</div>
														</div>
													</div>
												</td>
												<td class="text-center">Berlin</td>
												<td class="text-center">
													<div class="badge badge-success">Completed</div>
												</td>
												<td class="text-center">
													<button type="button" id="PopoverCustomT-2"
														class="btn btn-primary btn-sm">Details</button>
												</td>
											</tr>
											<tr>
												<td class="text-center text-muted">#321</td>
												<td>
													<div class="widget-content p-0">
														<div class="widget-content-wrapper">
															<div class="widget-content-left mr-3">
																<div class="widget-content-left">
																	<img width="40" class="rounded-circle"
																		src="${pageContext.request.contextPath}/resources/images/avatars/2.jpg"
																		alt="">
																</div>
															</div>
															<div class="widget-content-left flex2">
																<div class="widget-heading">Elliot Huber</div>
																<div class="widget-subheading opacity-7">Lorem
																	ipsum dolor sic</div>
															</div>
														</div>
													</div>
												</td>
												<td class="text-center">London</td>
												<td class="text-center">
													<div class="badge badge-danger">In Progress</div>
												</td>
												<td class="text-center">
													<button type="button" id="PopoverCustomT-3"
														class="btn btn-primary btn-sm">Details</button>
												</td>
											</tr>
											<tr>
												<td class="text-center text-muted">#55</td>
												<td>
													<div class="widget-content p-0">
														<div class="widget-content-wrapper">
															<div class="widget-content-left mr-3">
																<div class="widget-content-left">
																	<img width="40" class="rounded-circle"
																		src="${pageContext.request.contextPath}/resources/images/avatars/1.jpg"
																		alt="">
																</div>
															</div>
															<div class="widget-content-left flex2">
																<div class="widget-heading">Vinnie Wagstaff</div>
																<div class="widget-subheading opacity-7">UI
																	Designer</div>
															</div>
														</div>
													</div>
												</td>
												<td class="text-center">Amsterdam</td>
												<td class="text-center">
													<div class="badge badge-info">On Hold</div>
												</td>
												<td class="text-center">
													<button type="button" id="PopoverCustomT-4"
														class="btn btn-primary btn-sm">Details</button>
												</td>
											</tr>
										</tbody>
									</table>
								</div>
							</div>
						</div>
					</div>
				</div>

				<div class="app-wrapper-footer">
					<div class="app-footer">
						<div class="app-footer__inner">
							<div class="app-footer-right">
								<ul class="nav">
									<li class="nav-item"><a href="javascript:void(0);"
										class="nav-link"> Footer Link 3 </a></li>
									<li class="nav-item"><a href="javascript:void(0);"
										class="nav-link">
											<div class="badge badge-success mr-1 ml-0">
												<small>NEW</small>
											</div> Footer Link 4
									</a></li>
								</ul>
							</div>
						</div>
					</div>
				</div>

			</div>
			<!-- <script src="http://maps.google.com/maps/api/js?sensor=true"></script> -->
		</div>
	</div>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/resources/js/main.js"></script>
</body>
</html>
