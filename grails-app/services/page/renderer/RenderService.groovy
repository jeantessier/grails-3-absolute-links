package page.renderer


class RenderService {

    def groovyPageRenderer
    def grailsLinkGenerator

    def createConfirmMessage() {
        def homePageLink = grailsLinkGenerator.link(controller: 'index', absolute: true)
        groovyPageRenderer.render view: '/email/confirm', model: [ link: homePageLink, username: findUsername() ]
    }

    def createWelcomeMessage() {
        groovyPageRenderer.render template: '/email/welcome', model: [ username: findUsername() ]
    }

    def findUsername() {
        "mrhaki"
    }

}
