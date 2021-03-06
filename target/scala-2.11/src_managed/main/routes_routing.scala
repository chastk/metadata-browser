// @SOURCE:/home/tetherless/metadata-browser/conf/routes
// @HASH:b4dab174a50b2e96363b8fb6026d35330129349c
// @DATE:Mon Jul 06 15:22:17 EDT 2015


import scala.language.reflectiveCalls
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String): Unit = {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Application_index0_invoker = createInvoker(
controllers.Application.index(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
        

// @LINE:7
private[this] lazy val controllers_Application_postIndex1_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Application_postIndex1_invoker = createInvoker(
controllers.Application.postIndex(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "postIndex", Nil,"POST", """""", Routes.prefix + """"""))
        

// @LINE:8
private[this] lazy val controllers_Spatial_index2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("spatial"))))
private[this] lazy val controllers_Spatial_index2_invoker = createInvoker(
controllers.Spatial.index(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Spatial", "index", Nil,"GET", """""", Routes.prefix + """spatial"""))
        

// @LINE:9
private[this] lazy val controllers_Spatial_postIndex3_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("spatial"))))
private[this] lazy val controllers_Spatial_postIndex3_invoker = createInvoker(
controllers.Spatial.postIndex(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Spatial", "postIndex", Nil,"POST", """""", Routes.prefix + """spatial"""))
        

// @LINE:10
private[this] lazy val controllers_Hierarchy_index4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("metadata"))))
private[this] lazy val controllers_Hierarchy_index4_invoker = createInvoker(
controllers.Hierarchy.index(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Hierarchy", "index", Nil,"GET", """""", Routes.prefix + """metadata"""))
        

// @LINE:11
private[this] lazy val controllers_Hierarchy_postIndex5_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("metadata"))))
private[this] lazy val controllers_Hierarchy_postIndex5_invoker = createInvoker(
controllers.Hierarchy.postIndex(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Hierarchy", "postIndex", Nil,"POST", """""", Routes.prefix + """metadata"""))
        

// @LINE:12
private[this] lazy val controllers_Detector_index6_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("detectors"))))
private[this] lazy val controllers_Detector_index6_invoker = createInvoker(
controllers.Detector.index(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Detector", "index", Nil,"GET", """""", Routes.prefix + """detectors"""))
        

// @LINE:13
private[this] lazy val controllers_Detector_postIndex7_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("detectors"))))
private[this] lazy val controllers_Detector_postIndex7_invoker = createInvoker(
controllers.Detector.postIndex(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Detector", "postIndex", Nil,"POST", """""", Routes.prefix + """detectors"""))
        

// @LINE:14
private[this] lazy val controllers_Instrument_index8_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("instruments"))))
private[this] lazy val controllers_Instrument_index8_invoker = createInvoker(
controllers.Instrument.index(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Instrument", "index", Nil,"GET", """""", Routes.prefix + """instruments"""))
        

// @LINE:15
private[this] lazy val controllers_Instrument_postIndex9_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("instruments"))))
private[this] lazy val controllers_Instrument_postIndex9_invoker = createInvoker(
controllers.Instrument.postIndex(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Instrument", "postIndex", Nil,"POST", """""", Routes.prefix + """instruments"""))
        

// @LINE:16
private[this] lazy val controllers_Entity_index10_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("entities"))))
private[this] lazy val controllers_Entity_index10_invoker = createInvoker(
controllers.Entity.index(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Entity", "index", Nil,"GET", """""", Routes.prefix + """entities"""))
        

// @LINE:17
private[this] lazy val controllers_Entity_postIndex11_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("entities"))))
private[this] lazy val controllers_Entity_postIndex11_invoker = createInvoker(
controllers.Entity.postIndex(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Entity", "postIndex", Nil,"POST", """""", Routes.prefix + """entities"""))
        

// @LINE:20
private[this] lazy val controllers_Application_login12_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
private[this] lazy val controllers_Application_login12_invoker = createInvoker(
controllers.Application.login(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "login", Nil,"POST", """""", Routes.prefix + """login"""))
        

// @LINE:23
private[this] lazy val controllers_Assets_at13_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at13_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""POST""", prefix,"""controllers.Application.postIndex()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """spatial""","""controllers.Spatial.index()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """spatial""","""controllers.Spatial.postIndex()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """metadata""","""controllers.Hierarchy.index()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """metadata""","""controllers.Hierarchy.postIndex()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """detectors""","""controllers.Detector.index()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """detectors""","""controllers.Detector.postIndex()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """instruments""","""controllers.Instrument.index()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """instruments""","""controllers.Instrument.postIndex()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """entities""","""controllers.Entity.index()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """entities""","""controllers.Entity.postIndex()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.login()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0_route(params) => {
   call { 
        controllers_Application_index0_invoker.call(controllers.Application.index())
   }
}
        

// @LINE:7
case controllers_Application_postIndex1_route(params) => {
   call { 
        controllers_Application_postIndex1_invoker.call(controllers.Application.postIndex())
   }
}
        

// @LINE:8
case controllers_Spatial_index2_route(params) => {
   call { 
        controllers_Spatial_index2_invoker.call(controllers.Spatial.index())
   }
}
        

// @LINE:9
case controllers_Spatial_postIndex3_route(params) => {
   call { 
        controllers_Spatial_postIndex3_invoker.call(controllers.Spatial.postIndex())
   }
}
        

// @LINE:10
case controllers_Hierarchy_index4_route(params) => {
   call { 
        controllers_Hierarchy_index4_invoker.call(controllers.Hierarchy.index())
   }
}
        

// @LINE:11
case controllers_Hierarchy_postIndex5_route(params) => {
   call { 
        controllers_Hierarchy_postIndex5_invoker.call(controllers.Hierarchy.postIndex())
   }
}
        

// @LINE:12
case controllers_Detector_index6_route(params) => {
   call { 
        controllers_Detector_index6_invoker.call(controllers.Detector.index())
   }
}
        

// @LINE:13
case controllers_Detector_postIndex7_route(params) => {
   call { 
        controllers_Detector_postIndex7_invoker.call(controllers.Detector.postIndex())
   }
}
        

// @LINE:14
case controllers_Instrument_index8_route(params) => {
   call { 
        controllers_Instrument_index8_invoker.call(controllers.Instrument.index())
   }
}
        

// @LINE:15
case controllers_Instrument_postIndex9_route(params) => {
   call { 
        controllers_Instrument_postIndex9_invoker.call(controllers.Instrument.postIndex())
   }
}
        

// @LINE:16
case controllers_Entity_index10_route(params) => {
   call { 
        controllers_Entity_index10_invoker.call(controllers.Entity.index())
   }
}
        

// @LINE:17
case controllers_Entity_postIndex11_route(params) => {
   call { 
        controllers_Entity_postIndex11_invoker.call(controllers.Entity.postIndex())
   }
}
        

// @LINE:20
case controllers_Application_login12_route(params) => {
   call { 
        controllers_Application_login12_invoker.call(controllers.Application.login())
   }
}
        

// @LINE:23
case controllers_Assets_at13_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at13_invoker.call(controllers.Assets.at(path, file))
   }
}
        
}

}
     