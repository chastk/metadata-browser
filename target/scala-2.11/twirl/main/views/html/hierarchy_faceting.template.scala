
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
    subject: String,
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
            """),_display_(/*21.14*/hierarchy_fieldset(facetForm, fieldFacets, queryFacets, rangeFacets, pivotFacets, clusterFacets, subject, predicate)),format.raw/*21.130*/("""
        """)))}),format.raw/*22.10*/("""
        """),format.raw/*23.9*/("""</div>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
          <h1 class="page-header">Metadata Browser</h1>
		  <h4>"""),_display_(/*26.10*/final_query),format.raw/*26.21*/("""</h4>
		  <div class="row placeholders"></div>
		  <ul class="nav nav-tabs">
		    """),_display_(/*29.8*/for((thingType, query_results) <- documentMap) yield /*29.54*/ {_display_(Seq[Any](format.raw/*29.56*/("""
    		    """),format.raw/*30.11*/("""<li><a data-toggle="tab" href="#"""),_display_(/*30.44*/thingType),format.raw/*30.53*/("""">"""),_display_(/*30.56*/thingType),format.raw/*30.65*/("""</a></li>
		    """)))}),format.raw/*31.8*/("""
		  """),format.raw/*32.5*/("""</ul>
          <div class="row placeholders"></div>
          <div class = "tab-content">
            """),_display_(/*35.14*/for((thingType, query_results) <- documentMap) yield /*35.60*/ {_display_(Seq[Any](format.raw/*35.62*/("""
            
      			"""),format.raw/*37.10*/("""<div id=""""),_display_(/*37.20*/thingType),format.raw/*37.29*/("""" class="tab-pane fade in">
      				"""),_display_(/*38.12*/metadata_table(query_results)),format.raw/*38.41*/("""
      			"""),format.raw/*39.10*/("""</div>
      			
      		""")))}),format.raw/*41.10*/("""
          """),format.raw/*42.11*/("""</div>
        </div>
      </div>
    </div>

""")))}),format.raw/*47.2*/("""
"""))}
  }

  def render(facetForm:Form[views.formdata.FacetFormData],fieldFacets:models.FacetsWithCategories,queryFacets:models.FacetsWithCategories,rangeFacets:models.FacetsWithCategories,pivotFacets:models.FacetsWithCategories,clusterFacets:models.FacetsWithCategories,subject:String,predicate:String,documentMap:Map[String, models.SparqlQueryResults],final_query:String): play.twirl.api.HtmlFormat.Appendable = apply(facetForm,fieldFacets,queryFacets,rangeFacets,pivotFacets,clusterFacets,subject,predicate,documentMap,final_query)

  def f:((Form[views.formdata.FacetFormData],models.FacetsWithCategories,models.FacetsWithCategories,models.FacetsWithCategories,models.FacetsWithCategories,models.FacetsWithCategories,String,String,Map[String, models.SparqlQueryResults],String) => play.twirl.api.HtmlFormat.Appendable) = (facetForm,fieldFacets,queryFacets,rangeFacets,pivotFacets,clusterFacets,subject,predicate,documentMap,final_query) => apply(facetForm,fieldFacets,queryFacets,rangeFacets,pivotFacets,clusterFacets,subject,predicate,documentMap,final_query)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Jun 17 23:48:56 EDT 2015
                  SOURCE: /home/oneironym/jp/metadata-browser/app/views/hierarchy_faceting.scala.html
                  HASH: 42687abd4e7db4e615267514cc0c0f5880f1e7b3
                  MATRIX: 965->1|1479->411|1509->431|1537->433|1578->465|1618->467|1650->472|1797->592|1840->626|1880->628|1921->642|2059->758|2100->768|2136->777|2313->927|2345->938|2455->1022|2517->1068|2557->1070|2596->1081|2656->1114|2686->1123|2716->1126|2746->1135|2793->1152|2825->1157|2956->1261|3018->1307|3058->1309|3109->1332|3146->1342|3176->1351|3242->1390|3292->1419|3330->1429|3387->1455|3426->1466|3504->1514
                  LINES: 26->1|38->10|41->14|42->15|42->15|42->15|43->16|47->20|47->20|47->20|48->21|48->21|49->22|50->23|53->26|53->26|56->29|56->29|56->29|57->30|57->30|57->30|57->30|57->30|58->31|59->32|62->35|62->35|62->35|64->37|64->37|64->37|65->38|65->38|66->39|68->41|69->42|74->47
                  -- GENERATED --
              */
          