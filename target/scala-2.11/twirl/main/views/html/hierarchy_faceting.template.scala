
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
    thingType: String,
    predicate: String, 
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
            """),_display_(/*21.14*/hierarchy_fieldset(facetForm, fieldFacets, queryFacets, rangeFacets, pivotFacets, clusterFacets, thingType, predicate)),format.raw/*21.132*/("""
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

  def render(facetForm:Form[views.formdata.FacetFormData],fieldFacets:models.FacetsWithCategories,queryFacets:models.FacetsWithCategories,rangeFacets:models.FacetsWithCategories,pivotFacets:models.FacetsWithCategories,clusterFacets:models.FacetsWithCategories,thingType:String,predicate:String,documentMap:Map[String, models.SparqlQueryResults],final_query:String): play.twirl.api.HtmlFormat.Appendable = apply(facetForm,fieldFacets,queryFacets,rangeFacets,pivotFacets,clusterFacets,thingType,predicate,documentMap,final_query)

  def f:((Form[views.formdata.FacetFormData],models.FacetsWithCategories,models.FacetsWithCategories,models.FacetsWithCategories,models.FacetsWithCategories,models.FacetsWithCategories,String,String,Map[String, models.SparqlQueryResults],String) => play.twirl.api.HtmlFormat.Appendable) = (facetForm,fieldFacets,queryFacets,rangeFacets,pivotFacets,clusterFacets,thingType,predicate,documentMap,final_query) => apply(facetForm,fieldFacets,queryFacets,rangeFacets,pivotFacets,clusterFacets,thingType,predicate,documentMap,final_query)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Jun 01 18:00:44 EDT 2015
                  SOURCE: /home/oneironym/jp/metadata-browser/app/views/hierarchy_faceting.scala.html
                  HASH: eb909719be8be99f53984072ea361aa6cde9e9d3
                  MATRIX: 965->1|1481->413|1511->433|1539->435|1580->467|1620->469|1652->474|1799->594|1842->628|1882->630|1923->644|2063->762|2104->772|2140->781|2317->931|2349->942|2459->1026|2522->1073|2562->1075|2596->1082|2656->1115|2687->1125|2717->1128|2748->1138|2795->1155|2827->1160|2957->1263|3020->1310|3060->1312|3115->1339|3152->1349|3183->1359|3253->1402|3294->1422|3336->1436|3399->1468|3438->1479|3516->1527
                  LINES: 26->1|38->10|41->14|42->15|42->15|42->15|43->16|47->20|47->20|47->20|48->21|48->21|49->22|50->23|53->26|53->26|56->29|56->29|56->29|57->30|57->30|57->30|57->30|57->30|58->31|59->32|62->35|62->35|62->35|64->37|64->37|64->37|65->38|65->38|66->39|68->41|69->42|74->47
                  -- GENERATED --
              */
          