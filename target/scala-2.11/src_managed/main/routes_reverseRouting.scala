// @SOURCE:/home/oneironym/jp/metadata-browser/conf/routes
// @HASH:aa30437e014770dd6976a35df8006ce04ca12b5a
// @DATE:Thu Jun 25 13:11:24 EDT 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:16
// @LINE:13
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:9
// @LINE:8
class ReverseSpatial {


// @LINE:9
def postIndex(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "spatial")
}
                        

// @LINE:8
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "spatial")
}
                        

}
                          

// @LINE:16
class ReverseAssets {


// @LINE:16
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:11
// @LINE:10
class ReverseHierarchy {


// @LINE:11
def postIndex(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "metadata")
}
                        

// @LINE:10
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "metadata")
}
                        

}
                          

// @LINE:13
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:7
def postIndex(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix)
}
                        

// @LINE:6
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

// @LINE:13
def login(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "login")
}
                        

}
                          
}
                  


// @LINE:16
// @LINE:13
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:9
// @LINE:8
class ReverseSpatial {


// @LINE:9
def postIndex : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Spatial.postIndex",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "spatial"})
      }
   """
)
                        

// @LINE:8
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Spatial.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "spatial"})
      }
   """
)
                        

}
              

// @LINE:16
class ReverseAssets {


// @LINE:16
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:11
// @LINE:10
class ReverseHierarchy {


// @LINE:11
def postIndex : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Hierarchy.postIndex",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "metadata"})
      }
   """
)
                        

// @LINE:10
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Hierarchy.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "metadata"})
      }
   """
)
                        

}
              

// @LINE:13
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:7
def postIndex : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.postIndex",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:13
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.login",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

}
              
}
        


// @LINE:16
// @LINE:13
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:9
// @LINE:8
class ReverseSpatial {


// @LINE:9
def postIndex(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Spatial.postIndex(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Spatial", "postIndex", Seq(), "POST", """""", _prefix + """spatial""")
)
                      

// @LINE:8
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Spatial.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Spatial", "index", Seq(), "GET", """""", _prefix + """spatial""")
)
                      

}
                          

// @LINE:16
class ReverseAssets {


// @LINE:16
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:11
// @LINE:10
class ReverseHierarchy {


// @LINE:11
def postIndex(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Hierarchy.postIndex(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Hierarchy", "postIndex", Seq(), "POST", """""", _prefix + """metadata""")
)
                      

// @LINE:10
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Hierarchy.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Hierarchy", "index", Seq(), "GET", """""", _prefix + """metadata""")
)
                      

}
                          

// @LINE:13
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:7
def postIndex(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.postIndex(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "postIndex", Seq(), "POST", """""", _prefix + """""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:13
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.login(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "login", Seq(), "POST", """""", _prefix + """login""")
)
                      

}
                          
}
        
    