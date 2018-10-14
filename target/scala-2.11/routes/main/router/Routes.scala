
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/rk.arvind/Downloads/Web App/basic-api-app - Test/amplifyr-server/conf/routes
// @DATE:Tue Oct 24 16:23:54 IST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  DBConnectionController_1: controllers.DBConnectionController,
  // @LINE:9
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    DBConnectionController_1: controllers.DBConnectionController,
    // @LINE:9
    Assets_0: controllers.Assets
  ) = this(errorHandler, DBConnectionController_1, Assets_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, DBConnectionController_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.DBConnectionController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v1/dataset-read""", """controllers.DBConnectionController.previewData"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v1/json""", """controllers.DBConnectionController.filterData"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_DBConnectionController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_DBConnectionController_index0_invoker = createInvoker(
    DBConnectionController_1.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DBConnectionController",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Assets_at1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at1_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_DBConnectionController_previewData2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v1/dataset-read")))
  )
  private[this] lazy val controllers_DBConnectionController_previewData2_invoker = createInvoker(
    DBConnectionController_1.previewData,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DBConnectionController",
      "previewData",
      Nil,
      "GET",
      """""",
      this.prefix + """v1/dataset-read"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_DBConnectionController_filterData3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v1/json")))
  )
  private[this] lazy val controllers_DBConnectionController_filterData3_invoker = createInvoker(
    DBConnectionController_1.filterData,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DBConnectionController",
      "filterData",
      Nil,
      "POST",
      """""",
      this.prefix + """v1/json"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_DBConnectionController_index0_route(params) =>
      call { 
        controllers_DBConnectionController_index0_invoker.call(DBConnectionController_1.index)
      }
  
    // @LINE:9
    case controllers_Assets_at1_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at1_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:15
    case controllers_DBConnectionController_previewData2_route(params) =>
      call { 
        controllers_DBConnectionController_previewData2_invoker.call(DBConnectionController_1.previewData)
      }
  
    // @LINE:16
    case controllers_DBConnectionController_filterData3_route(params) =>
      call { 
        controllers_DBConnectionController_filterData3_invoker.call(DBConnectionController_1.filterData)
      }
  }
}
