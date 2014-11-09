package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def menu2 = Action {
	Ok(views.html.menu2("Your new application is ready."))
  }

}