<%@ page contentType="text/html"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<gr:layout title="Edit des voyageurs">
	<div id="content">

		<section>
			<div class="section-header">
				<ol class="breadcrumb">
					<li><a href="/ProjetSpring/admin/user/list">Voyageurs</a></li>
					<li class="active">Editer Voyageurs</li>
				</ol>
			</div>
			<div class="section-body contain-lg">
				<div class="row">

					<!-- BEGIN ADD CONTACTS FORM -->
					<div class="col-md-12">
						<div class="card">
							<div class="card-head style-primary">
								<header>Ajout d'un nouveau voyageur</header>
							</div>
							<form class="form" role="form" action="editUser" method="post"
								modelAttribute="user">

								<!-- BEGIN FORM TABS -->
								<div class="card-head style-primary">
									<ul class="nav nav-tabs tabs-text-contrast tabs-accent"
										data-toggle="tabs">
										<li class="active"><a href="#contact">Information
												Personnele</a></li>
										<li><a href="#experience">Information Compte</a></li>

									</ul>
								</div>
								<!--end .card-head -->
								<!-- END FORM TABS -->

								<!-- BEGIN FORM TAB PANES -->
								<div class="card-body tab-content">
									<div class="tab-pane active" id="contact">
										<div class="row">
											<div class="col-md-8">
												<div class="row">
													<div class="col-md-6">
														<div class="form-group">
															<input name="tel" type="text" class="form-control"
																id="street" value=<c:out value="${user.numCarte}" />>
															<label for="mobile">N°Carte</label>
														</div>
													</div>
													<!--end .col -->

												</div>
												<!--end .row -->
												<div class="form-group">
													<input name="mail" type="email" class="form-control"
														id="email" value=<c:out value="${user.mail}" />>
													<label for="email">Email</label>
												</div>



											</div>
											<!--end .row -->
										</div>
										<!--end .tab-pane -->
										<div class="tab-pane" id="experience">
											<div class="form-group">
												<input name="login" type="text" class="form-control"
													value=<c:out value="${user.login}" />> <label
													for="email">Login</label>
											</div>
											<!--end .form-group -->

											<div class="row">
												<div class="col-md-6">
													<div class="form-group">
														<input name="password" type="password"
															class="form-control"
															value=<c:out value="${user.password}" />> <label
															for="mobile">Mot de Passe</label>
													</div>
												</div>
												<!--end .col -->
												<div class="col-md-6">
													<div class="form-group">
														<input type="password" class="form-control"
															value=<c:out value="${user.password}" />> <label
															for="phone">Mot de passe</label>
													</div>
												</div>
												<!--end .col -->
											</div>

										</div>
										<!--end .tab-pane -->
										<!--end .tab-pane -->
										<!--end .tab-pane -->
									</div>
									<!--end .card-body.tab-content -->
									<!-- END FORM TAB PANES -->

									<!-- BEGIN FORM FOOTER -->
									<div class="card-actionbar">
										<div class="card-actionbar-row">
											<button type="reset"
												class="btn btn-flat ink-reaction btn-danger">Vider</button>
											<button type="submit"
												class="btn btn-flat ink-reaction btn-success">Ajouter</button>
										</div>
										<!--end .card-actionbar-row -->
									</div>
									<!--end .card-actionbar -->
									<!-- END FORM FOOTER -->
							</form>
						</div>
						<!--end .card -->
					</div>
					<!--end .col -->
					<!-- END ADD CONTACTS FORM -->

				</div>
				<!--end .row -->
			</div>
			<!--end .section-body -->
		</section>
	</div>
</gr:layout>

