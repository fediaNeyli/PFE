<%@ page contentType="text/html"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<gr:layout title="Ajouter des users">

	<div id="content">

		<section>
			<div class="section-header">
				<ol class="breadcrumb">
					<li><a href="/ProjetSpring/admin/user/list">Utilisateurs</a></li>
					<li class="active">Ajout Utilisateur</li>
				</ol>
			</div>
			<div class="section-body contain-lg">
				<div class="row">

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
												<input name="numCarte" type="text" class="form-control"
													id="street"> <label for="street">N° Carte</label>
											</div>
										</div>
										<!--end .col -->

									</div>
									<!--end .row -->
									<div class="form-group">
										<input name="mail" type="email" class="form-control"
											id="email"> <label for="email">Email</label>
									</div>

									<div class="tab-pane" id="experience">
										<div class="form-group">
											<input name="login" type="text" class="form-control">
											<label for="email">Login</label>
										</div>
										<!--end .form-group -->

										<div class="row">
											<div class="col-md-6">
												<div class="form-group">
													<input name="password" type="text" class="form-control">
													<label for="mobile">Mot de Passe</label>
												</div>
											</div>
											<!--end .col -->
											<div class="col-md-6">
												<div class="form-group">
													<input type="text" class="form-control"> <label
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

