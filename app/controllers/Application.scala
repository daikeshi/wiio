package controllers

import play.api.mvc.{Action, Controller}

object Application extends Controller {

  def index = tasks

  def tasks = TODO

  def newTask = TODO

  def deleteTask(id: Long) = TODO

}