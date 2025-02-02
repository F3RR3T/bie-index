package au.org.ala.bie
import au.org.ala.web.AlaSecured

@AlaSecured(value = "ROLE_ADMIN", redirectUri = "/")
class AdminController {

    def index() {} // GSP only index

    // Documented in openapi.yml
    def indexFields() {
        redirect(controller: "misc", action: "indexFields") // shouldn't get triggered due UrlMappings
    }
}