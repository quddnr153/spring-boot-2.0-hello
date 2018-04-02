package me.spring.boot;

/**
 * @author Byungwook Lee on 2018-04-03
 * quddnr153@gmail.com
 * https://github.com/quddnr153
 */
public class GitRepository {
	private String id;
	private String name;
	private String url;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
