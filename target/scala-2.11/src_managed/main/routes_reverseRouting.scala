// @SOURCE:/home/tetherless/metadata-browser/conf/routes
// @HASH:0f8e3c23b1791dbb6233c1dc95f3ea2f3acf86ab
// @DATE:Thu Jul 02 20:56:14 EDT 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:21
// @LINE:18
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:21
class ReverseAssets {


// @LINE:21
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:13
// @LINE:12
class ReverseDetector {


// @LINE:13
def postIndex(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "detectors")
}
                        

// @LINE:12
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "detectors")
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
                          

// @LINE:18
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
                        

// @LINE:18
def login(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "login")
}
                        

}
                          

// @LINE:14
class ReverseInstrument {


// @LINE:14
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "instruments")
}
                        

}
                          
}
                  


// @LINE:21
// @LINE:18
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:21
class ReverseAssets {


// @LINE:21
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:13
// @LINE:12
class ReverseDetector {


// @LINE:13
def postIndex : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Detector.postIndex",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "detectors"})
      }
   """
)
                        

// @LINE:12
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Detector.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "detectors"})
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
              

// @LINE:18
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
                        

// @LINE:18
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.login",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

}
              

// @LINE:14
class ReverseInstrument {


// @LINE:14
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Instrument.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "instruments"})
      }
   """
)
                        

}
              
}
        


// @LINE:21
// @LINE:18
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:21
class ReverseAssets {


// @LINE:21
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:13
// @LINE:12
class ReverseDetector {


// @LINE:13
def postIndex(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Detector.postIndex(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Detector", "postIndex", Seq(), "POST", """""", _prefix + """detectors""")
)
                      

// @LINE:12
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Detector.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Detector", "index", Seq(), "GET", """""", _prefix + """detectors""")
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
                          

// @LINE:18
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
                      

// @LINE:18
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.login(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "login", Seq(), "POST", """""", _prefix + """login""")
)
                      

}
                          

// @LINE:14
class ReverseInstrument {


// @LINE:14
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Instrument.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Instrument", "index", Seq(), "GET", """""", _prefix + """instruments""")
)
                      

}
                          
}
        
    