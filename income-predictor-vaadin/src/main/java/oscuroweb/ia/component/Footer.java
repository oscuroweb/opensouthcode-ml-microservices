package oscuroweb.ia.component;

import com.jarektoro.responsivelayout.ResponsiveColumn.ColumnComponentAlignment;
import com.jarektoro.responsivelayout.ResponsiveLayout;
import com.jarektoro.responsivelayout.ResponsiveRow;
import com.vaadin.icons.VaadinIcons;
import com.vaadin.server.ThemeResource;
import com.vaadin.ui.Image;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

public class Footer extends ResponsiveLayout {

	private static final long serialVersionUID = 9155040833896797714L;
	
	private Image sparkLogo;
	private Image springLogo;
	private Image vaadinLogo;
	private Image githubLogo;
	private Image twitterLogo;
	private VerticalLayout infoLayout;
	private Label twitterLabel;
	private Label githubLabel;

	public Footer() {

		this.setSizeFull();
		this.addStyleName("footer");
        
		initializeImage();
		initializeInfoLayout();
		
		ResponsiveRow rowFooter = this.addRow();
		
		rowFooter.addColumn()
			.withDisplayRules(12, 6, 3, 3)
			.withVisibilityRules(false, false, true, true)
			.withComponent(sparkLogo, ColumnComponentAlignment.CENTER);

		rowFooter.addColumn()
			.withDisplayRules(12, 6, 3, 3)
			.withVisibilityRules(false, false, true, true)
			.withComponent(springLogo, ColumnComponentAlignment.CENTER);

		rowFooter.addColumn()
			.withDisplayRules(12, 6, 3, 3)
			.withVisibilityRules(false, false, true, true)
			.withComponent(vaadinLogo, ColumnComponentAlignment.CENTER);

		rowFooter.addColumn()
			.withDisplayRules(12, 6, 3, 3)
			.withVisibilityRules(false, false, true, true)
			.withComponent(githubLogo, ColumnComponentAlignment.CENTER);


	}
	
	private void initializeInfoLayout() {
		
		infoLayout = new VerticalLayout();
		
		githubLabel = new Label("http://github.com/oscuroweb");
		twitterLabel = new Label("@oscuroweb");
		twitterLabel.setIcon(VaadinIcons.TWITTER);
		
		
		
	}
	
	private void initializeImage() {

        // Spark Logo
        sparkLogo = new Image();
        sparkLogo.setSource(new ThemeResource("images/spark-logo.png"));
        sparkLogo.setHeight(90, Unit.PIXELS);
        // Spring Logo
        springLogo = new Image();
        springLogo.setSource(new ThemeResource("images/spring-boot.png"));
        springLogo.setHeight(90, Unit.PIXELS);
        // Vaadin Logo
        vaadinLogo = new Image();
        vaadinLogo.setSource(new ThemeResource("images/vaadin-black.png"));
        vaadinLogo.setHeight(90, Unit.PIXELS);
        // Github Logo
        githubLogo = new Image();
        githubLogo.setSource(new ThemeResource("images/github.png"));
        githubLogo.setHeight(90, Unit.PIXELS);
        // Twitter Logo
        twitterLogo = new Image();
        twitterLogo.setSource(new ThemeResource("images/twitter.png"));
        twitterLogo.setHeight(90, Unit.PIXELS);
	}
	
}
