
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object user_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class user extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String, redirectUrl: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.40*/("""

"""),_display_(/*3.2*/main("Welcome to Play")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""
    """),format.raw/*4.5*/("""<a href=""""),_display_(/*4.15*/redirectUrl),format.raw/*4.26*/(""""><em><b>Log in with google API!</b></em></a>
""")))}),format.raw/*5.2*/("""
"""))
      }
    }
  }

  def render(message:String,redirectUrl:String): play.twirl.api.HtmlFormat.Appendable = apply(message,redirectUrl)

  def f:((String,String) => play.twirl.api.HtmlFormat.Appendable) = (message,redirectUrl) => apply(message,redirectUrl)

  def ref: this.type = this

}


}

/**/
object user extends user_Scope0.user
              /*
                  -- GENERATED --
                  DATE: Mon Oct 23 12:37:07 IST 2017
                  SOURCE: C:/Users/rk.arvind/Downloads/Web App/basic-api-app/amplifyr-server/app/views/user.scala.html
                  HASH: 209eaa6974d72f446ce4036e42c11ae134de08e5
                  MATRIX: 532->1|665->39|693->42|724->65|763->67|794->72|830->82|861->93|937->140
                  LINES: 20->1|25->1|27->3|27->3|27->3|28->4|28->4|28->4|29->5
                  -- GENERATED --
              */
          