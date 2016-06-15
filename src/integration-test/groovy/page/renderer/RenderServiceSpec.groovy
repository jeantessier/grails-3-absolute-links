package page.renderer


import grails.test.mixin.integration.Integration
import grails.transaction.*
import spock.lang.*

@Integration
@Rollback
class RenderServiceSpec extends Specification {

    @Autowired
    RenderService renderService

    void "welcomeMessage() should return a partial"() {
        expect:
            renderService.createWelcomeMessage().trim() == "Hi, mrhaki"
    }

    void "createConfirmMessage() should return HTML"() {
        given:
        def expectedOutput = '''        <!doctype html>
        <html>
        <head>
            <title>Confirmation</title>
        </head>

        <body>

        <h2>Hi, mrhaki
        </h2>

        <p>
            Thank you for your registration.
        </p>

        <p>
            To use the application can you directly go to the
            <a href="http://localhost:8080/index">home page</a>.
        </p>

        </body>
        </html>
        '''

        when:
        def actualOutput = renderService.createConfirmMessage()

        then:
        actualOutput == expectedOutput.stripIndent()
    }

}
