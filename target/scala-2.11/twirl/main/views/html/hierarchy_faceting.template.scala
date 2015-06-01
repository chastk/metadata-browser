
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._

/**/
object hierarchy_faceting extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template10[Form[views.formdata.FacetFormData],models.FacetsWithCategories,models.FacetsWithCategories,models.FacetsWithCategories,models.FacetsWithCategories,models.FacetsWithCategories,String,String,Map[String, models.SparqlQueryResults],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(  facetForm: Form[views.formdata.FacetFormData],
    fieldFacets: models.FacetsWithCategories,
    queryFacets: models.FacetsWithCategories,
    rangeFacets: models.FacetsWithCategories,
    pivotFacets: models.FacetsWithCategories,
    clusterFacets: models.FacetsWithCategories,
    namedLocation: String,
    spatialPredicates: String, 
    documentMap : Map[String, models.SparqlQueryResults],
    final_query : String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._

Seq[Any](format.raw/*10.26*/("""


"""),format.raw/*14.1*/("""
"""),_display_(/*15.2*/main("Hierarchy Faceted Search")/*15.34*/ {_display_(Seq[Any](format.raw/*15.36*/("""
    """),format.raw/*16.5*/("""<div class="container-fluid">
      
      <div class="row">
        <div class="col-sm-3 col-md-2 sidebar">
          """),_display_(/*20.12*/form(routes.Hierarchy.postIndex())/*20.46*/ {_display_(Seq[Any](format.raw/*20.48*/("""
            """),_display_(/*21.14*/spatial_fieldset(facetForm, fieldFacets, queryFacets, rangeFacets, pivotFacets, clusterFacets, namedLocation, spatialPredicates)),format.raw/*21.142*/("""
        """)))}),format.raw/*22.10*/("""
        """),format.raw/*23.9*/("""</div>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
          <h1 class="page-header">Metadata Browser</h1>
		  <h4>"""),_display_(/*26.10*/final_query),format.raw/*26.21*/("""</h4>
		  <div class="row placeholders"></div>
		  <ul class="nav nav-tabs">
		    """),_display_(/*29.8*/for((collection, query_results) <- documentMap) yield /*29.55*/ {_display_(Seq[Any](format.raw/*29.57*/("""
		  		"""),format.raw/*30.7*/("""<li><a data-toggle="tab" href="#"""),_display_(/*30.40*/collection),format.raw/*30.50*/("""">"""),_display_(/*30.53*/collection),format.raw/*30.63*/("""</a></li>
		    """)))}),format.raw/*31.8*/("""
		  """),format.raw/*32.5*/("""</ul>
          <div class="row placeholders"></div>
          <div class = "tab-content">
          	"""),_display_(/*35.13*/for((collection, query_results) <- documentMap) yield /*35.60*/ {_display_(Seq[Any](format.raw/*35.62*/("""
          		
          			"""),format.raw/*37.14*/("""<div id=""""),_display_(/*37.24*/collection),format.raw/*37.34*/("""" class="tab-pane fade in">
          				"""),_display_(/*38.16*/table(query_results)),format.raw/*38.36*/("""
          			"""),format.raw/*39.14*/("""</div>
          		
          	""")))}),format.raw/*41.13*/("""
          """),format.raw/*42.11*/("""</div>
        </div>
      </div>
    </div>

""")))}),format.raw/*47.2*/("""
"""))}
  }

  def render(facetForm:Form[views.formdata.FacetFormData],fieldFacets:models.FacetsWithCategories,queryFacets:models.FacetsWithCategories,rangeFacets:models.FacetsWithCategories,pivotFacets:models.FacetsWithCategories,clusterFacets:models.FacetsWithCategories,namedLocation:String,spatialPredicates:String,documentMap:Map[String, models.SparqlQueryResults],final_query:String): play.twirl.api.HtmlFormat.Appendable = apply(facetForm,fieldFacets,queryFacets,rangeFacets,pivotFacets,clusterFacets,namedLocation,spatialPredicates,documentMap,final_query)

  def f:((Form[views.formdata.FacetFormData],models.FacetsWithCategories,models.FacetsWithCategories,models.FacetsWithCategories,models.FacetsWithCategories,models.FacetsWithCategories,String,String,Map[String, models.SparqlQueryResults],String) => play.twirl.api.HtmlFormat.Appendable) = (facetForm,fieldFacets,queryFacets,rangeFacets,pivotFacets,clusterFacets,namedLocation,spatialPredicates,documentMap,final_query) => apply(facetForm,fieldFacets,queryFacets,rangeFacets,pivotFacets,clusterFacets,namedLocation,spatialPredicates,documentMap,final_query)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun May 31 21:38:36 EDT 2015
                  SOURCE: /home/oneironym/jp/hierarchy-faceting/app/views/hierarchy_faceting.scala.html
                  HASH: 0fb559776dadb2ce94d3666d6a180d118f4cf2ea
                  MATRIX: 965->1|1493->425|1523->445|1551->447|1592->479|1632->481|1664->486|1811->606|1854->640|1894->642|1935->656|2085->784|2126->794|2162->803|2339->953|2371->964|2481->1048|2544->1095|2584->1097|2618->1104|2678->1137|2709->1147|2739->1150|2770->1160|2817->1177|2849->1182|2979->1285|3042->1332|3082->1334|3137->1361|3174->1371|3205->1381|3275->1424|3316->1444|3358->1458|3421->1490|3460->1501|3538->1549
                  LINES: 26->1|38->10|41->14|42->15|42->15|42->15|43->16|47->20|47->20|47->20|48->21|48->21|49->22|50->23|53->26|53->26|56->29|56->29|56->29|57->30|57->30|57->30|57->30|57->30|58->31|59->32|62->35|62->35|62->35|64->37|64->37|64->37|65->38|65->38|66->39|68->41|69->42|74->47
                  -- GENERATED --
              */
          