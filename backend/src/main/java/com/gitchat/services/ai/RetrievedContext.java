package com.gitchat.services.ai;

import com.gitchat.dto.CitationDto;
import java.util.List;

public record RetrievedContext(
        List<CitationDto> citations,
        String contextText) {
}
